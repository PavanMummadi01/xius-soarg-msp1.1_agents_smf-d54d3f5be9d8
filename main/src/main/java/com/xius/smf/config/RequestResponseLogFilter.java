/**
 * @author shashidhar.p
 */

package com.xius.smf.config;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;
import org.springframework.web.util.WebUtils;

@Component
public class RequestResponseLogFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		ContentCachingRequestWrapper wrappedRequest = new ContentCachingRequestWrapper(request);
		ContentCachingResponseWrapper wrapperResponse = new ContentCachingResponseWrapper(response);
		// pass through filter chain to do the actual request handling
		filterChain.doFilter(wrappedRequest, wrapperResponse);
		// body can only be read after the actual request handling was done!
		log(wrappedRequest, wrapperResponse);

	}

	private void log(ContentCachingRequestWrapper wrappedRequest, ContentCachingResponseWrapper wrapperResponse) {
		logger.info(wrappedRequest.getMethod());
		logger.info(wrappedRequest.getRequestURI());
		logger.info(wrappedRequest.getRemoteAddr());
		getReqBody(wrappedRequest);
		logger.info(wrapperResponse.getStatus());
		getResBody(wrapperResponse,wrappedRequest);
	}

	private void getReqBody(ContentCachingRequestWrapper request) {
		// wrap request to make sure we can read the body of the request (otherwise it
		// will be consumed by the actual request handler)
		ContentCachingRequestWrapper wrapper = WebUtils.getNativeRequest(request, ContentCachingRequestWrapper.class);
		
		if (wrapper != null) {
			byte[] buf = wrapper.getContentAsByteArray();
			if (buf.length > 0) {
				String payload;
				try {
					payload = new String(buf, 0, buf.length, wrapper.getCharacterEncoding());
				} catch (UnsupportedEncodingException ex) {
					payload = "[unknown]";
				}
				logger.info("Request Payload " + payload);
			}
		}
	}

	private void getResBody(ContentCachingResponseWrapper response,ContentCachingRequestWrapper request) {

		String responseBody = new String(response.getContentAsByteArray());
		logger.info("Response Payload " + responseBody);
		try {
			
			response.copyBodyToResponse();
			
		} catch (IOException e) {
			logger.info("Response Exception :" + e);
		}

	}

}

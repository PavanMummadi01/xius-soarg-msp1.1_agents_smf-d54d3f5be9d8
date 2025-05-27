/**
 * Copyright   2012 XIUS.
 * All rights reserved. These computer programs, listings, and
 * specifications are the property of XIUS. 
 * And may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of XIUS.
 *
 */
/**
* ${todo}
* @author srikanthm $Author: kiranmai.kode $
* @version $Id: //depot/xb/MSP1.0/MSP-AWS/agents/smf/main/src/main/java/com/xius/smf/domaindata/GetExpiredActsData.java#2 $ 
* $DateTime: 2023/12/08 12:29:41 $Change:  $
*/

package com.xius.smf.domaindata;

import java.math.BigDecimal;

 

public class GetExpiredActsData extends DomainDataBase{
	
	private BigDecimal[] po_expired_msisdns;

	public BigDecimal[] getPo_expired_msisdns() {
		return po_expired_msisdns;
	}

	public void setPo_expired_msisdns(BigDecimal[] po_expired_msisdns) {
		this.po_expired_msisdns = po_expired_msisdns;
	}
}


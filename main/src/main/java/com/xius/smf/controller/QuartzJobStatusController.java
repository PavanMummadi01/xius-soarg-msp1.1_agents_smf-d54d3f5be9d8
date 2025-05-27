package com.xius.smf.controller;

import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.Trigger.TriggerState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class QuartzJobStatusController {

    @Autowired
    private Scheduler scheduler;

    @GetMapping("/jobs-status")
    public Map<String, Object> getAllJobsStatus() {
        Map<String, Object> jobStatusMap = new HashMap<>();

        try {
            // Get all job keys (job identifiers) from the scheduler
            Set<JobKey> jobKeys = scheduler.getJobKeys(org.quartz.impl.matchers.GroupMatcher.anyGroup());

            // Iterate over each job key and get its status
            for (JobKey jobKey : jobKeys) {
                // For each job, get its triggers
                List<Trigger> triggers = (List<Trigger>) scheduler.getTriggersOfJob(jobKey);

                if (!triggers.isEmpty()) {
                    Trigger trigger = triggers.get(0); // Assuming a single trigger per job for simplicity
                    TriggerState triggerState = scheduler.getTriggerState(trigger.getKey());

                    // Create a map for job details, including status, firing times
                    Map<String, Object> jobDetails = new HashMap<>();
                    jobDetails.put("status", triggerState.name());
                    jobDetails.put("previousFireTime", trigger.getPreviousFireTime());
                    jobDetails.put("nextFireTime", trigger.getNextFireTime());

                    // Add job name and details to the response map
                    jobStatusMap.put(jobKey.getName(), jobDetails);
                } else {
                    Map<String, Object> noTriggerDetails = new HashMap<>();
                    noTriggerDetails.put("status", "No triggers associated");
                    jobStatusMap.put(jobKey.getName(), noTriggerDetails);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            Map<String, Object> errorDetails = new HashMap<>();
            errorDetails.put("error", "Error retrieving jobs status");
            jobStatusMap.put("error", errorDetails);
        }

        return jobStatusMap;
    }
}



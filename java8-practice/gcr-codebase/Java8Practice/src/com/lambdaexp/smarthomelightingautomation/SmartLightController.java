package com.lambdaexp.smarthomelightingautomation;

/**
 * SmartLightController is responsible for triggering
 * different lighting behaviors.
 */
public class SmartLightController {

    /**
     * Triggers a lighting action.
     */
    public void trigger(LightAction action) {
        action.execute();
    }
}


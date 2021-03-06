/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.aries.jmx.test.blueprint.framework;

import org.apache.aries.jmx.blueprint.BlueprintStateMBean;


public class BlueprintEventValidator extends AbstractCompositeDataValidator{
    public BlueprintEventValidator(long bundleId, long extenderBundleId, int eventType){
        super(BlueprintStateMBean.OSGI_BLUEPRINT_EVENT_TYPE);  
        setExpectValue(BlueprintStateMBean.BUNDLE_ID, bundleId);
        setExpectValue(BlueprintStateMBean.EXTENDER_BUNDLE_ID, extenderBundleId);
        setExpectValue(BlueprintStateMBean.EVENT_TYPE, eventType);
    }
    
}
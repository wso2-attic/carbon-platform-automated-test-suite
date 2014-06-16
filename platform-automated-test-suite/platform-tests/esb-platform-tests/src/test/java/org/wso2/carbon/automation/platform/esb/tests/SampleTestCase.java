/*
*Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*WSO2 Inc. licenses this file to you under the Apache License,
*Version 2.0 (the "License"); you may not use this file except
*in compliance with the License.
*You may obtain a copy of the License at
*
*http://www.apache.org/licenses/LICENSE-2.0
*
*Unless required by applicable law or agreed to in writing,
*software distributed under the License is distributed on an
*"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*KIND, either express or implied.  See the License for the
*specific language governing permissions and limitations
*under the License.
*/
package org.wso2.carbon.automation.platform.esb.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTestCase {

    @BeforeClass(alwaysRun = true)
    public void initTest() {
        System.out.println("init before");
    }

    @Test(groups = "wso2.esb")
    public void testESB1() {
        System.out.println("Test1");
    }

    @Test(groups = "wso2.esb")
    public void testESB2() {
        System.out.println("Test1");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        System.out.println("after class");
    }
}

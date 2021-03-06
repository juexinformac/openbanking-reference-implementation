/**
 * Copyright 2019 ForgeRock AS.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.forgerock.openbanking.gateway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix = "as.headless")
public class HeadLessAuthProperties {
    public static class DefaultPsu {
        private String username;
        private String password;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    private boolean alwaysEnable;
    private boolean headerEnable;
    private DefaultPsu defaultPsu;

    public boolean isAlwaysEnable() {
        return alwaysEnable;
    }

    public void setAlwaysEnable(boolean alwaysEnable) {
        this.alwaysEnable = alwaysEnable;
    }

    public boolean isHeaderEnable() {
        return headerEnable;
    }

    public void setHeaderEnable(boolean headerEnable) {
        this.headerEnable = headerEnable;
    }

    public DefaultPsu getDefaultPsu() {
        return defaultPsu;
    }

    public void setDefaultPsu(DefaultPsu defaultPsu) {
        this.defaultPsu = defaultPsu;
    }
}
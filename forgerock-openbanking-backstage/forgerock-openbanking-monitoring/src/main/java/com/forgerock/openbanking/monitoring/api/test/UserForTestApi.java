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
package com.forgerock.openbanking.monitoring.api.test;

import com.forgerock.openbanking.exceptions.OBErrorResponseException;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Api(tags = "Test-users")
@RequestMapping(
        value = "/api/test/user"
)
public interface UserForTestApi {

    @RequestMapping(
            value = "/",
            method = RequestMethod.POST
    )
    ResponseEntity createUser() throws OBErrorResponseException;

    @RequestMapping(
            value = "/",
            method = RequestMethod.DELETE
    )
    ResponseEntity deleteUser(
            @RequestParam(name = "username") String username
    ) throws OBErrorResponseException;
}

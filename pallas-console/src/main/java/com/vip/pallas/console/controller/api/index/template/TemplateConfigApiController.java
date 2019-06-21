/**
 * Copyright 2019 vip.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.vip.pallas.console.controller.api.index.template;

import com.vip.pallas.mybatis.entity.TemplateWithThrottling;
import com.vip.pallas.mybatis.entity.TemplateWithTimeoutRetry;
import com.vip.pallas.service.SearchTemplateService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TemplateConfigApiController {

    @Resource
    private SearchTemplateService templateService;

    @RequestMapping("/template/retrytimeout_configured.json")
    public List<TemplateWithTimeoutRetry> findAllRetryTimeOutConfig() {
        return templateService.findAllRetryTimeOutConfig();
    }

	@RequestMapping("/template/throttling_configured.json")
	public List<TemplateWithThrottling> findAllThrottlingConfig() {
		List<TemplateWithThrottling> configs = templateService.findAllThrottlingConfig();
		return configs;
	}
}
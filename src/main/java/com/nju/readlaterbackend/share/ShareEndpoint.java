package com.nju.readlaterbackend.share;

import com.netflix.discovery.DiscoveryClient;
import com.nju.readlaterbackend.share.data.AddRequest;
import com.nju.readlaterbackend.share.data.ShareContent;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;
import org.slf4j.Logger;

/**
 * created by yanjunjie
 */
@RestController
public class ShareEndpoint {

    @Inject
    private ContentManagement contentManagement;

    private static final Logger logger = LoggerFactory.getLogger(ShareContent.class);

//    @Autowired
//    private DiscoveryClient client;
//
    @Autowired
    private Registration registration;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
//        ServiceInstance instance = serviceInstance();
        logger.info("/hello,host:" + registration.getHost()+
                ",service_id:" + registration.getServiceId());
        return "Hello World";

    }

    @POST
    @RequestMapping("addContent")
    public String addShareContent(@RequestBody AddRequest request) {
        String result = contentManagement.addShareContent(request);
        return result;
    }

    @GET
    @RequestMapping("getContent")
    public List<ShareContent> getContent() {
        return contentManagement.getShareContent();
    }

    @POST
    @RequestMapping("changeReadStatus")
    public String changeReadStatus(@RequestBody AddRequest request) {
        String result = contentManagement.changeStatus(request);
        return result;
    }
//
//    @PUT
//    @Path("reviewed")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @ApiOperation(value = "Register accountName", response = Response.class)
//    public Response registerAccountName(@Valid ReviewRequest request) {
//        String review = request.getReview();
//        long registerUserId = request.getUserId();
//        String language = Language.ZH;
//        reviewManagement.operateLdapAccount(registerUserId, review);
//        reviewManagement.reviewRegisterInfo(review, registerUserId);
//        reviewManagement.sendEmail(registerUserId, review, language);
//        return Response.ok("{}").build();
//    }
}


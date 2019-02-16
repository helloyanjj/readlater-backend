package com.nju.readlaterbackend.share;

import com.nju.readlaterbackend.ReturnInfo;
import com.nju.readlaterbackend.share.data.AddRequest;
import com.nju.readlaterbackend.share.data.ShareContent;
import com.nju.readlaterbackend.share.dto.ContentRespository;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;

/**
 * created by yanjunjie
 */
@Component
public class ContentManagement {
    @Inject
    private ShareContent shareContent;

    @Inject
    private ContentRespository contentRespository;

    public String addShareContent(AddRequest request) {
        shareContent = new ShareContent();
        try {
            shareContent.setAction(request.getAction());
            shareContent.setType(request.getType());
            shareContent.setContent(request.getContent());
            shareContent.setHaveRead("false");
            shareContent.setUserId(request.getUserId());
            contentRespository.save(shareContent);
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnInfo.fail;
        }

        return ReturnInfo.success;

    }

    public String changeStatus(AddRequest request) {
        long id = request.getId();
        String haveRead = request.getHaveRead();
        try {
            contentRespository.changeReadStatus(id, haveRead);
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnInfo.fail;
        }

        return ReturnInfo.success;

    }

    public List<ShareContent> getAllShareContent() {
        return contentRespository.findAll();
    }

    public List<ShareContent> getShareContent() {
        return contentRespository.findShareContentsByUserId("yanjunjie");
    }
}


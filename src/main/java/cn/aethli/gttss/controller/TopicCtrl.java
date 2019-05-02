package cn.aethli.gttss.controller;

import cn.aethli.gttss.domain.ResponseMessage;
import cn.aethli.gttss.domain.SysUser;
import cn.aethli.gttss.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;
import java.util.Map;

@SessionAttributes(value = {"identifyingCode", "currentUser", "verifyT"}, types = {String.class, SysUser.class, String.class})
@RestController
@RequestMapping(value = "/topic")
public class TopicCtrl extends BaseCtrl {
    @Autowired
    TopicService topicService;

    @RequestMapping(value = "/queryCurrentTopic")
    public Object queryCurrentTopic() {
        List<Map<String, Object>> topics = topicService.queryCurrentTopic(getCurrentBatch());
        return new ResponseMessage(ResponseMessage.STATUS_OK, topics);
    }


    @RequestMapping(value = "/querySelectAbleTopic")
    public Object querySelectAbleTopic() {
        List<Map<String, Object>> topics = topicService.querySelectAbleTopic(getCurrentBatch());
        return new ResponseMessage(ResponseMessage.STATUS_OK, topics);
    }

    @RequestMapping(value = "/getTopicById")
    public Object getTopicById(@RequestBody Map<String, Object> params) {
        try {
            return new ResponseMessage(ResponseMessage.STATUS_OK, topicService.getTopicById((String) params.get("id")));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage(ResponseMessage.STATUS_ERROR, e.getMessage());
        }
    }

    @RequestMapping(value = "/selectTopic")
    public Object selectTopic(@RequestBody Map<String, Object> params, Model model) {
        try {
            return new ResponseMessage(ResponseMessage.STATUS_OK, topicService.selectTopic((String) params.get("id"), getSysUser(model)));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage(ResponseMessage.STATUS_FAIL, e.getMessage());
        }
    }

    @RequestMapping(value = "/cancelTopic")
    public Object cancelTopic(@RequestBody Map<String, Object> params, Model model) {
        try {
            return new ResponseMessage(ResponseMessage.STATUS_OK, topicService.cancelTopic((String) params.get("id"), getSysUser(model)));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage(ResponseMessage.STATUS_FAIL, e.getMessage());
        }
    }

    @RequestMapping(value = "/getMyTopic")
    public Object getMyTopic(Model model) {
        try {
            return new ResponseMessage(ResponseMessage.STATUS_OK, topicService.getMyTopic(getSysUser(model)));
        } catch (Exception e) {
//            e.printStackTrace();
            return new ResponseMessage(ResponseMessage.STATUS_FAIL, e.getMessage());
        }
    }

    @RequestMapping(value = "/getAllSelectForCustomize")
    public Object getAllSelectForCustomize(Model model) {
        try {
            return new ResponseMessage(ResponseMessage.STATUS_OK, topicService.getAllSelectForCustomize(getSysUser(model)));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage(ResponseMessage.STATUS_FAIL, e.getMessage());
        }
    }

    @RequestMapping(value = "/saveCustomizeTopic")
    public Object saveCustomizeTopic(@RequestBody Map<String, Object> params, Model model) {
        try {
            return new ResponseMessage(ResponseMessage.STATUS_OK, topicService.saveCustomizeTopic(getSysUser(model), params));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage(ResponseMessage.STATUS_FAIL, e.getMessage());
        }
    }

    @RequestMapping(value = "/getTeacherHistoryTopic")
    public Object getTeacherHistoryTopic(Model model) {
        try {
            return new ResponseMessage(ResponseMessage.STATUS_OK, topicService.getTeacherHistoryTopic(getSysUser(model)));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage(ResponseMessage.STATUS_FAIL, e.getMessage());
        }
    }

    @RequestMapping(value = "/getTeacherVerifyTopic")
    public Object getTeacherVerifyTopic(Model model) {
        try {
            return new ResponseMessage(ResponseMessage.STATUS_OK, topicService.getTeacherVerifyTopic(getSysUser(model)));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage(ResponseMessage.STATUS_FAIL, e.getMessage());
        }
    }

    @RequestMapping(value = "/getCustomizeTopicVerify")
    public Object getCustomizeTopicVerify(Model model) {
        try {
            return new ResponseMessage(ResponseMessage.STATUS_OK, topicService.getCustomizeTopicVerify(getSysUser(model)));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage(ResponseMessage.STATUS_FAIL, e.getMessage());
        }
    }

    @RequestMapping(value = "/teacherGetTopicVerifyCheck")
    public Object teacherGetTopicVerifyCheck(Model model) {
        try {
            return new ResponseMessage(ResponseMessage.STATUS_OK, topicService.teacherGetTopicVerifyCheck(getSysUser(model)));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage(ResponseMessage.STATUS_FAIL, e.getMessage());
        }
    }

    @RequestMapping(value = "/getMyTopicT")
    public Object getMyTopicStudent(Model model) {
        try {
            return new ResponseMessage(ResponseMessage.STATUS_OK, topicService.getMyTopicT(getSysUser(model)));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage(ResponseMessage.STATUS_FAIL, e.getMessage());
        }
    }

    @RequestMapping(value = "/getMyTopicStudentT")
    public Object getMyTopicStudentT(Model model) {
        try {
            return new ResponseMessage(ResponseMessage.STATUS_OK, topicService.getMyTopicStudentT(getSysUser(model)));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage(ResponseMessage.STATUS_FAIL, e.getMessage());
        }
    }
}

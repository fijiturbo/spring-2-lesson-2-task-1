package uz.pdp.spring2lesson2task1.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.spring2lesson2task1.dto.Result;
import uz.pdp.spring2lesson2task1.dto.response.ResponseAttachment;
import uz.pdp.spring2lesson2task1.entity.Attachment;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
public interface AttachmentService {

    Result upload(MultipartHttpServletRequest request);

    List<Attachment> findAll();

    ResponseAttachment findOne(Integer id, HttpServletResponse response);

    Result edit(MultipartHttpServletRequest request, Integer id);

    Result delete(Integer id);

}

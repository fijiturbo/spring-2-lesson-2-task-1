package uz.pdp.spring2lesson2task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.spring2lesson2task1.entity.AttachmentContent;

import java.util.Optional;


@Repository
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {

    Optional<AttachmentContent> findAttachmentContentByAttachmentId(Integer attachmentId);

    void deleteAllByAttachment_Id(Integer attachment_id);
}

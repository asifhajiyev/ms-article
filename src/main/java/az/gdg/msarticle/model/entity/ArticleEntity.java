package az.gdg.msarticle.model.entity;

import com.mongodb.lang.Nullable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "article")
public class ArticleEntity {
    @Id
    private String id;
    private Integer userId;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Integer clapCount;
    private Integer readCount;
    private boolean isDraft;
    private boolean isApproved;
    //private Integer approverId;
    @DBRef
    private List<TagEntity> tags;
    private List<Comment> comments;
}
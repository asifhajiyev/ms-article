package az.gdg.msarticle.controller;

import az.gdg.msarticle.model.ArticleRequest;
import az.gdg.msarticle.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("Article Controller")
@RequestMapping("/article")
@CrossOrigin(exposedHeaders = "Access-Control-Allow-Origin")
@RequiredArgsConstructor
public class ArticleController {

    private static final Logger logger = LoggerFactory.getLogger(ArticleController.class);
    private final ArticleService articleService;

    @PostMapping(value = "/add-draft")
    @ApiOperation("add draft article to database")
    public String addDraft(@RequestBody ArticleRequest articleRequest,
                           @RequestHeader("X-Auth-Token") String token) {

        logger.debug("addDraft start");
        return articleService.addDraft(token, articleRequest);
    }
}

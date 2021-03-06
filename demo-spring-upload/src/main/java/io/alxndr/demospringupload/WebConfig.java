package io.alxndr.demospringupload;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Slf4j
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${file.upload.path}")
    private String filePath;

    /*
    * img/** 로 들어오는 요청은 image path에서 파일로 찾는다.
    * */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String masterPath = filePath + File.separator;
        registry.addResourceHandler("/img/**")
                .addResourceLocations("file://" + masterPath + "images/");
    }
}

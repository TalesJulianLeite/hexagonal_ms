package com.leite.tales.default_hexagonal.application.ports.out;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileServicePort {
    void processFile(MultipartFile file) throws IOException;
}

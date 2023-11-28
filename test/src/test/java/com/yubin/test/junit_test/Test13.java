package com.yubin.test.junit_test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test13 {

    @TempDir
    Path tempDirectory;

    @Test
    void testCreateFile() throws IOException {
        // 임시 디렉터리 내에 임시 파일을 생성합니다.
        File tempFile = new File(tempDirectory.toFile(), "test.txt");
        assertTrue(tempFile.createNewFile());

        // tempFile에서 파일 작업을 수행

        // 단언문 및 추가 테스트 로직
        assertTrue(tempFile.exists());
    }

    @Test
    void testDeleteFile() throws IOException {

        File tempFile = new File(tempDirectory.toFile(), "test.txt");
        assertTrue(tempFile.createNewFile());

        // 임시 파일 삭제
        assertTrue(tempFile.delete());

        assertTrue(!tempFile.exists());
    }
}



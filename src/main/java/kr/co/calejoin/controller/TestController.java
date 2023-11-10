package kr.co.calejoin.controller;

import kr.co.calejoin.dto.test.TestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping(value={"/test"})
//    @CrossOrigin(origins = "http://localhost:3000/")
    public ResponseEntity<TestDTO> getTestData(){

        TestDTO data = new TestDTO(1, "홍길동");

        return new ResponseEntity<>(data, HttpStatus.OK);
    }
    @GetMapping(value={"/test2"})
    public ResponseEntity<TestDTO> getTestData2(){

        TestDTO data = new TestDTO(2, "김철수");

        return new ResponseEntity<>(data, HttpStatus.OK);
    }
    @GetMapping(value={"/test3"})
    public ResponseEntity<TestDTO> getTestData3(){

        TestDTO data = new TestDTO(3, "김춘삼");

        return new ResponseEntity<>(data, HttpStatus.OK);
    }
    @GetMapping(value={"/test4"})
    public ResponseEntity<TestDTO> getTestData4(){

        TestDTO data = new TestDTO(4, "김미희");

        return new ResponseEntity<>(data, HttpStatus.OK);
    }
    @GetMapping("hi")
    public String getTest(){


        return "dd";
    }
}

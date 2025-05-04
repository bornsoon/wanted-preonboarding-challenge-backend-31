package org.example.preassignment.test.service;

import org.example.preassignment.test.mapper.TestMapper;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    // 스프링 4.3이상부터는 생성자 1개일 경우 @Autowired 생략 가능
    private final TestMapper testMapper;

    // 생성자 하나 -> 자동 주입 (스프링이 알아서)
    // Autowired는 필드 주입 (테스트 어려움, final 못 씀, 순환 참조 문제 유발 가능)
    // 생성자 주입 (불변성(final), 테스트 용이)
    public TestService(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    public int getTestValue() {
        return testMapper.testSelectOne();
    }
}

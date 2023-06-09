package org.example;

/*
요구사항
비밀번호는 최소 8자 이상 12자 이하여야 한다.
비밀번호가 8자 미만 12자 초과인 경우 IllegalArgumentException 예와를 발생시킨다.
경계조건에 대해 테스트 코드를 작성해야 한다.
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PasswordValidatorTest {

    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하면 예외가 발생하지 않는다.")
    @Test
    void validatePasswordTest() {
        assertThatCode(() ->PasswordValidator.validate("sezard"))
            .doesNotThrowAnyException();
    }
}

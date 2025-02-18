package hello.core.autowired;

import hello.core.member.Member;
import io.micrometer.common.lang.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

public class AutowiredTest {
    @Test
    void AutowiredOption(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean{
        @Autowired(required = false)  // 아예 메서드 호출 안 함
        public void setNoBean1(Member noBean1) {
            System.out.println("setNoBean1 = " + noBean1);
        }

        @Autowired  // 대상이 없으면 null
        public void setNoBean2(@Nullable Member noBean1) {
            System.out.println("setNoBean2 = " + noBean1);
        }

        @Autowired  // 대상이 없으면 Optional.empty
        public void setNoBean3(Optional<Member> noBean1) {
            System.out.println("setNoBean3 = " + noBean1);
        }
    }
}

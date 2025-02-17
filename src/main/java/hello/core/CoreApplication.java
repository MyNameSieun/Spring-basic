package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

    public static class MemberApp {
        public static void main(String[] args) {
            AppConfig appConfig = new AppConfig();

            MemberService memberService = appConfig.memberService();

            Member member = new Member(1L,"sieun", Grade.VIP);
            memberService.join(member);
            Member findMember = memberService.findMember(1L);

            System.out.println("new member = " + member.getName());
            System.out.println("find member = " + findMember.getName());

        }
    }
}

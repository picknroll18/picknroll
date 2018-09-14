<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- <link rel="stylesheet" type="text/css" href="/resources/css/member/login.css"> -->
<main id="main">
	<div class="main-container">
		<section id="top-menu">
			<input type="button" value="홈버튼" class="button home-button" />
		</section>
		<section id="logo"> 
			<h1>   
				<a href="/index">
					<picture>
					 	 <!-- <source media="(min-width: 700px)" srcset="/resources/images/okinawa.jpg"> -->
						 <img src="/resources/images/logo.png">   
					</picture>
				</a>   
			</h1> 
		</section>
		<section id="member-menu">
			<h1 class="hide">멤버메뉴</h1> 
			<ul>
				<li><a href="join-reg">회원가입</a></li>  
				<li><a href="find-id">계정찾기</a></li> 
			</ul> 
		</section>
		<section id="member-container">
			<h1 class="hide">로그인폼</h1>
			<form method="post" id="member-form">
				<ul>
					<li>
						<label for="id"><img src="/resources/images/icon-member.png" /></label>
						<input type="text" name="username" class="login-input" id="id" placeholder="아이디를 입력해주세요." autocomplete=off />
					</li>
					<li>
						<label for="password"><img src="/resources/images/icon-lock.png" /></label>
						<input type="password" name="password" class="login-input" id="password" placeholder="비밀번호를 입력해주세요." autocomplete=off />
					</li>
					<li>
						<input type="checkbox" id="auto-login" />
						<label for="auto-login">자동로그인</label>
					</li>
	 			</ul>
				<input id="submit-button" class="button black-button bottom-button" type="submit" value="로그인" />  
				<a id="kakao-login-btn"></a>
    			<a href="http://developers.kakao.com/logout"></a>
			</form>
		</section>  
	</div>
</main>
<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>
<script type='text/javascript'>
    //<![CDATA[
    // 사용할 앱의 JavaScript 키를 설정해 주세요.
    Kakao.init('e085ccd0b0226738aca355e93c5fc124');
    // 카카오 로그인 버튼을 생성합니다.
    Kakao.Auth.createLoginButton({
        container: '#kakao-login-btn',
        success: function (authObj) {
            alert(JSON.stringify(authObj));
        },
        fail: function (err) {
            alert(JSON.stringify(err));
        }
    });
  //]]>
</script>

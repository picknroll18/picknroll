<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="/resources/css/member/login.css">
<main id="main">
	<div class="main-container">
		<section id="top-menu">
			<input type="button" class="button home-button" />
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
				<li>회원가입</li>  
				<li>계정찾기</li> 
			</ul> 
		</section>
		<section id="member-container">
			<h1 class="hide">로그인폼</h1>
			<form action="" id="member-form">
				<ul>
					<li><label for="id"><img src="/resources/images/icon-member.png" /></label><input type="text" class="input-text" id="id" placeholder="아이디를 입력해주세요." autocomplete=off /></li>
					<li><label for="password"><img src="/resources/images/icon-lock.png" /></label><input type="password" class="input-text" id="password" placeholder="비밀번호를 입력해주세요." autocomplete=off /></li>
					<li><input type="checkbox" id="auto-login" /><label for="auto-login">자동로그인</label></li>
	 			</ul>
				<input id="submit-button" class="button black-button bottom-button" type="button" value="로그인" />  
			</form>
		</section> 
	</div>
</main>
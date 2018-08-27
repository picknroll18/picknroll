<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="/resources/css/member/login.css">
<main id="main">
	<div class="content-container">
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
		<section id="login-container">
			<h1 class="hide">로그인폼</h1>
			<form action="" id="login-form">
				<ul>
					<li class="id-li"><img src="/resources/images/icon-member.png" /><input type="text" /></li>
					<li class="password-li"><img src="/resources/images/icon-lock.png" /><input type="text" /></li>
					<li><input type="checkbox" /><span>자동로그인</span></li>
				</ul>
				<input id="login-button" class="btn" type="button" />
			</form>
		</section>
	</div>
</main>
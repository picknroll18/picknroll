<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="/resources/css/member/profile.css">
<main id="main"> 
	<div class="main-container">  
		<section id="top-menu">
			<input type="button" class="button home-button" />
		</section>
		
		<section id="main-title"> 
			<h1>프로필</h1> 
		</section>
		
		<section id="member-profile">
			<h1 class="hide">프로필사진</h1>
			<div class="profile-photo" style="background: url('/resources/images/okinawa.jpg') no-repeat center; background-size: cover; "></div>
		</section>
		  
		<section id="member-container" class="content-container">
			<h1 class="hide">프로필</h1>
			<div action="" id="member-form">
				<ul>
					<li><label class="list-label" for="">아이디</label><span>flwjflwj</span></li>
					<li><label class="list-label" for="">이메일</label><span>flwj@naver.com</span></li>
					<li><label class="list-label" for="">닉네임</label><span>고슴도치가시</span></li>
					<li><label class="list-label" for="">성별</label><span>남</span></li>
					<li><label class="list-label" for="">생년월일</label><span>1990-01-06</span></li>
	 			</ul>    
			</div>
		</section>
		<section id="edit-buttons">
			<input id="password-button" class="button black-button bottom-button-md" type="button" value="비밀번호변경" />
			<input id="detail-button" class="button black-button bottom-button-md" type="button" value="부가정보변경" />
		</section>
	</div>  
</main>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="/resources/css/member/detail-edit.css">
<style>
</style>
<main id="main"> 
	<div class="main-container">
		<section id="top-menu">
			<input type="button" class="button home-button" />
		</section>
		
		<section id="main-title"> 
			<h1>부가정보변경</h1> 
		</section>
		
		<section id="page-description">
			<h1 class="hide">부가설명</h1> 
			<p>서비스에 필요한 부가정보를 변경해주세요.</p> 
		</section>
		<section id="member-profile">
			<h1 class="hide">프로필사진</h1>
			<div class="profile-photo" style="background: url('/resources/images/okinawa.jpg') no-repeat center; background-size: cover; "></div>
		</section>  
		<section id="member-container" class="content-container">
			<h1 class="hide">회원가입폼</h1>
			<form action="" id="member-form">
				<ul>
					<li>
						<label class="list-label" for="">프로필사진</label>
						<input type="button" class="button blue-button wide-button" value="파일선택" />
					</li>
					<li>
						<label class="list-label" for="">성별</label>
						<select class="input-select"> 
							<option>남</option>
							<option>여</option>
						</select>
					</li>  
					<li>
						<label class="list-label" for="">생년월일</label>
						<input type="date" class="input-select">
					</li>
	 			</ul>    
				<input id="submit-button" class="button black-button bottom-button" type="button" value="완료" />  
			</form>
		</section>
	</div>  
</main>
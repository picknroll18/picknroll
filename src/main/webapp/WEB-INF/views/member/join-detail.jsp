<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="/resources/css/member/join-detail.css">
<style>
</style>
<main id="main"> 
	<div class="main-container">
		<section id="top-menu">
			<input type="button" class="button home-button" />
		</section>
		
		<section id="main-title"> 
			<h1>회원가입</h1> 
		</section>
		
		<section id="page-description">
			<h1 class="hide">부가설명</h1> 
			<p>회원가입을 축하드립니다. 서비스에 필요한 부가정보를 입력해주세요.</p> 
		</section>
<!-- 		    border-top-left-radius: 4px;
    border-top-right-radius: 4px;
    border-bottom-right-radius: 4px;
    border-bottom-left-radius: 4px;
    border: 1px solid #ccc;
    box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
    background-color: rgb(255, 255, 255);
    line-height: 40px; -->
		<section id="member-container" class="content-container">
			<h1 class="hide">회원가입폼</h1>
			<form action="" id="member-form">
				<ul>
					<li>
						<label class="list-label" for="">프로필사진</label>
						<input type="button" class="button blue-button file-button" value="파일선택" />
					</li>
					<li>
						<label class="list-label" for="">성별</label>
						<select>
							<option>남</option>
							<option>여</option>
						</select>
					</li>  
					<li>
						<label class="list-label" for="">생년월일</label>
						<input type="date">
					</li>
	 			</ul>    
				<input id="submit-button" class="button black-button bottom-button" type="button" value="다음" />  
			</form>
		</section>
	</div>  
</main>
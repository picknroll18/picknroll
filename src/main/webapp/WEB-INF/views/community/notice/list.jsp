<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<style>
	#main-title{
		border-bottom: 1px solid #bebebe;
		padding : 5px 0px;
		margin : 5px;
	}
</style>
<main>
	<section id="main-title">
		<h1>공지사항</h1>
	</section>
	<section id="article-search">
		<h1 class="hide">글검색</h1>
		<form>
			<select>
				<option>전체</option>
				<option>제목</option>
				<option>내용</option>
				<option>작성자</option>
			</select>
			<input type="text" />
			<input type="button">
		</form>
	</section>
	
	<section>
		<h1>글목록</h1>
		<table>
			<tr>
				<td></td>
			</tr>
		</table>
	</section>
</main>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세화면</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="style10-detail.css">
</head>
<body>
	<%
	// 아티스트 정보 

	Map<String, Object> artistInfo = new HashMap<>();
	artistInfo.put("name", "아이유");
	artistInfo.put("debut", 2008);
	artistInfo.put("agency", "EDAM엔터테인먼트");
	artistInfo.put("photo", "https://musicmeta-phinf.pstatic.net/artist/000/112/112579.jpg?type=ff300_300");

	// 아이유 노래 리스트 
	List<Map<String, Object>> musicList = new ArrayList<>();

	Map<String, Object> musicInfo = new HashMap<>();
	musicInfo.put("id", 1);
	musicInfo.put("title", "팔레트");
	musicInfo.put("album", "Palette");
	musicInfo.put("singer", "아이유");
	musicInfo.put("thumbnail", "https://musicmeta-phinf.pstatic.net/album/002/000/2000240.jpg?type=r360Fll");
	musicInfo.put("time", 217);
	musicInfo.put("composer", "아이유");
	musicInfo.put("lyricist", "아이유");
	musicList.add(musicInfo);

	musicInfo = new HashMap<>();
	musicInfo.put("id", 2);
	musicInfo.put("title", "좋은날");
	musicInfo.put("album", "Real");
	musicInfo.put("singer", "아이유");
	musicInfo.put("thumbnail", "https://musicmeta-phinf.pstatic.net/album/000/184/184117.jpg?type=r360Fll");
	musicInfo.put("time", 233);
	musicInfo.put("composer", "이민수");
	musicInfo.put("lyricist", "김이나");
	musicList.add(musicInfo);

	musicInfo = new HashMap<>();
	musicInfo.put("id", 3);
	musicInfo.put("title", "밤편지");
	musicInfo.put("album", "palette");
	musicInfo.put("singer", "아이유");
	musicInfo.put("thumbnail", "https://musicmeta-phinf.pstatic.net/album/002/000/2000240.jpg?type=r360Fll");
	musicInfo.put("time", 253);
	musicInfo.put("composer", "제휘,김희원");
	musicInfo.put("lyricist", "아이유");
	musicList.add(musicInfo);

	musicInfo = new HashMap<>();
	musicInfo.put("id", 4);
	musicInfo.put("title", "삐삐");
	musicInfo.put("album", "삐삐");
	musicInfo.put("singer", "아이유");
	musicInfo.put("thumbnail", "https://musicmeta-phinf.pstatic.net/album/002/559/2559408.jpg?type=r360Fll");
	musicInfo.put("time", 194);
	musicInfo.put("composer", "이종훈");
	musicInfo.put("lyricist", "아이유");
	musicList.add(musicInfo);

	musicInfo = new HashMap<>();
	musicInfo.put("id", 5);
	musicInfo.put("title", "스물셋");
	musicInfo.put("album", "CHAT-SHIRE");
	musicInfo.put("singer", "아이유");
	musicInfo.put("thumbnail", "https://musicmeta-phinf.pstatic.net/album/000/592/592471.jpg?type=r360Fll");
	musicInfo.put("time", 194);
	musicInfo.put("composer", "아이유,이종훈,이채규");
	musicInfo.put("lyricist", "아이유");
	musicList.add(musicInfo);

	musicInfo = new HashMap<>();
	musicInfo.put("id", 6);
	musicInfo.put("title", "Blueming");
	musicInfo.put("album", "Love poem");
	musicInfo.put("singer", "아이유");
	musicInfo.put("thumbnail", "https://musicmeta-phinf.pstatic.net/album/003/399/3399860.jpg?type=r360Fll");
	musicInfo.put("time", 217);
	musicInfo.put("composer", "아이유,이종훈,이채규");
	musicInfo.put("lyricist", "아이유");
	musicList.add(musicInfo);

	int id = Integer.parseInt(request.getParameter("id"));
	%>

	<div id="wrap">
		<header class="d-flex align-items-center logo">
			<div class="display-3 text-success">Melong</div>
			<input type="text" class="form-control" style="width: 300px;">
			<button type="submit" class="btn btn-info">검색</button>
		</header>
		<nav class="main-menu">
			<ul class="nav justify-content-start">
				<li class="nav-item" style="margin-right: 15px;"><a href="#"
					class="nav-link text-dark">멜롱차트</a></li>
				<li class="nav-item" style="margin-right: 15px;"><a href="#"
					class="nav-link text-dark">최신음악</a></li>
				<li class="nav-item" style="margin-right: 15px;"><a href="#"
					class="nav-link text-dark">장르음악</a></li>
				<li class="nav-item" style="margin-right: 15px;"><a href="#"
					class="nav-link text-dark">멜롱DJ</a></li>
				<li class="nav-item" style="margin-right: 15px;"><a href="#"
					class="nav-link text-dark">뮤직어워드</a></li>
			</ul>
		</nav>

		<main>

			<section class="d-flex section1 border border-success p-3 rounded">
				<%
				for (Map<String, Object> songInfo : musicList) {
					int songId = (Integer) songInfo.get("id");
					if (songId == id) {
				%>
				<img src="<%=songInfo.get("thumbnail")%>" alt="썸네일" width="300">

				<div class="song data ms-5">
					<h3 class="fw-bold"><%=songInfo.get("title")%></h3>
					<h4 class="mb-3"><%=songInfo.get("singer")%></h4>
					<h4 class="mb-3">
						앨범
						<%=songInfo.get("album")%></h4>
					<h4 class="mb-3">
						재생시간
						<%=songInfo.get("time")%></h4>
					<h4 class="mb-3">
						작곡가
						<%=songInfo.get("composer")%></h4>
					<h4 class="mb-3">
						작사가
						<%=songInfo.get("lyricist")%></h4>
				</div>

				<%
				}
				}
				%>
			</section>

			<section class="section2 mt-5">
				<h2>가사</h2>
				<hr>
				<h3>가사 정보 없음</h3>
				<hr>

			</section>
		</main>
		<footer>Copyright 2021.Melong All Right Reserved.</footer>

	</div>
</body>
</html>
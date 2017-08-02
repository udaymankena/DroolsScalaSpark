package com.scalayadu.fact

class Movie {
  
  var movieId = ""
  var movieName = ""
  
  def getMovieId() = {
	  movieId
  }
  def setMovieId(movieId: String) {
  	this.movieId = movieId;
  }
  def getMovieName() = {
  	movieName;
  }
  def setMovieName(movieName:String) {
  	this.movieName = movieName;
  }
}
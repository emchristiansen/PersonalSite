package personal.controllers

import org.joda.time.LocalDate
import org.joda.time.Years

import personal.views
import play.api.mvc.Action
import play.api.mvc.Controller

object PersonalSite extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  def phdYear = {
    val started = new LocalDate("2008-09-23")
    val current = new LocalDate
    val elapsedYears = Years.yearsBetween(started, current).getYears

    elapsedYears match {
      case 0 => "first"
      case 1 => "second"
      case 2 => "third"
      case 3 => "fourth"
      case 4 => "fifth"
      case 5 => "sixth"
      case 6 => "seventh"
      case _ => ???
    }
  }
}
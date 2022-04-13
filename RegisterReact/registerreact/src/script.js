import React from "react";
import ReactDOM from "react-dom/client";
import "./index.css";
import App from "./App";
import reportWebVitals from "./reportWebVitals";

function showSubmitted() {
  var firstName = document.getElementById("fName").value;
  var lastName = document.getElementById("lName").value;
  var email = document.getElementById("email").value;
  var country = document.getElementById("country").value;

  document.getElementById("show").innerHTML =
    firstName + "<br>" + lastName + "<br>" + email + "<br>" + country;
}

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC page1</title>
</head>
<body>

<table border="1" width="45%">

login successfull with user ${user.email}, country ${user.country }

<form action="processCd">
<tr>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">CD Title</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="title">
    </div>
  </div><br/>
 </tr>
 
 <tr>
  <fieldset class="form-group">
    <div class="row">
      <legend class="col-form-label col-sm-2 pt-0">CD Type</legend>
      <div class="col-sm-10">
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="International" checked>
          <label class="form-check-label" for="gridRadios1">
            International 
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="Special Editon">
          <label class="form-check-label" for="gridRadios2">
            Special Edition
          </label>
        </div>
      </div>
    </div>
  </fieldset>
  </tr>
  
  <tr>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">Year</label>
    <div class="col-sm-10">
      <input type="datetime-local" class="form-control" name="date">
    </div>
  </div><br/>
  </tr>
  
  <tr>
  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">Add CD</button>
    </div>
  </div>
  </tr>
</form>
</table>

</body>
</html>
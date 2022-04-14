import './App.css';

function App() {


  function ShowSubmitted() {
    var firstName = document.getElementById("fName").value;
    var lastName = document.getElementById("lName").value;
    var email = document.getElementById("email").value;
    var country = document.getElementById("country").value;

    document.getElementById("show").innerHTML =
      firstName + "<br>" + lastName + "<br>" + email + "<br>" + country;
    // console.log("You clicked me!");
    
  }

  return (
    <div className='App'>
      <h1>Student Registration</h1>
      <div id='design'>
        <form action='/nothing.php'>
          <label htmlFor='fName'>First Name</label>
          <input
            type='text'
            id='fName'
            name='firstName'
            placeholder='Please enter your first name'
          ></input>

          <label htmlFor='lName'>Last Name</label>
          <input
            type='text'
            id='lName'
            name='lastName'
            placeholder='Please enter your last name'
          ></input>

          <label htmlFor='email'>Email Address</label>
          <input
            type='text'
            id='email'
            name='emailAddress'
            placeholder='Please enter your email address'
          ></input>

          <label htmlFor='country'>Country</label>
          <select name='country' id='country'>
            <option value='USA'>USA</option>
            <option value='Canada'>Canada</option>
            <option value='Mexico'>Mexico</option>
          </select>

          <input type='button' value='Submit' onClick={ShowSubmitted}></input>
        </form>
      </div>
      <div id='show' className='showtxt'></div>
    </div>
  );
}

export default App;

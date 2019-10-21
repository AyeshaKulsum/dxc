import React, { Component } from 'react';
import './App.css'
import { BrowserRouter as Router, Route, Link } from "react-router-dom";
class App extends Component {
  render() {
    return (
      
      <div>
      <ul>
          <li>
              <Link to="/">Home</Link>
          </li>
          <li>
              <Link to="/customers" >Customers</Link>
          </li>
          <li>
              <Link to="/employees">Employee</Link>
          </li>
          <li>
              <Link to="/products">Product</Link>
          </li>
      </ul>
</div>
    );
  }
}

export default App;
{/* <div className="mydiv">
        <a href="App">Home&nbsp;&nbsp;&nbsp;&nbsp;|</a>
        <a href="customers">Customer&nbsp;&nbsp;&nbsp;&nbsp;|</a>
        <a href="employees">Employee&nbsp;&nbsp;</a>
        <hr/>
        <h1>Home Page - Welcome to DXC</h1>
      </div> */}
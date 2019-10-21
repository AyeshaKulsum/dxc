import React from "react";
import { BrowserRouter as Router, Route, Link } from "react-router-dom";
import Customer from "./Customer";
import Employee from "./Employee";
import App from './App'
export default function MyHomePage() {
    return (
        <Router>
                <Route exact path="/" component={App} />
                <Route path="/customers" component={Customer} />
                <Route path="/employees" component={Employee} />
           
        </Router>
    );
}

function Customers({ match }) {
    return (
        <div>
            <h2>Customers</h2>
            <ul>
                <li>
                    <Link to={`${match.url}/1009`}>Rahul</Link>
                </li>
                <li>
                    <Link to={`${match.url}/3009`}>Neha</Link>
                </li>
                <li>
                    <Link to={`${match.url}/5678`}>Pooja</Link>
                </li>
            </ul>
            <Route path={`${match.path}/:customerId`} 
                component={CustomerDetails} />
        </div>
    );
}
function CustomerDetails({ match }) {
    return (
        <div>
            <h3>{match.params.customerId}</h3>
        </div>
    );
}
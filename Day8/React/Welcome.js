import React from 'react'
import ReactDOM from 'react-dom'
function Welcome(props)
{
    return (<div>
        <h1>Hello, {props.empName}</h1>
        <h2>Address: {props.empAddress}</h2>
        </div>)
}
const element = <Welcome empName="Ayesha" empAddress="Banglore"/>
ReactDOM.render(element,document.getElementById("root"))
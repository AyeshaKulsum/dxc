import React from 'react'
import ReactDOM from 'react-dom'

function clock(props) {
    return (
    <div>
    <h1>Real TIme Clock Demo using React</h1>
    <h2>It is {props.date.toLocaleTimeString()}.</h2>
    </div>
    );
}

function display() {
    ReactDOM.render (
        <div>
<clock date={new Date()}></clock>
<clock date={new Date(2011,0,1,0,18,20,0)}></clock>
        </div>,
        document.getElementById('abc')
    );

   
}
setInterval(display,1000) 
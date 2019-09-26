import React from 'react'
import ReactDOM from 'react-dom'
class Welcome extends React.Component
{
    render(){
        return <h1>Hello {this.props.empName}</h1>
    }
}
ReactDOM.render(<Welcome empName="Ayesha"/>,document.getElementById("root"))
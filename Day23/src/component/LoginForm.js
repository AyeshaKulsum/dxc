import React, { Component } from 'react';

class LoginForm extends Component {
    constructor(props) {
        super(props);
        this.state={
            value:'',
            textButton:""
        }
        this.handleChange=this.handleChange.bind(this)
        this.takeInputData=this.takeInputData.bind(this)
    }
    
    handleChange(ourData)
    {
        this.setState({
            value: ourData.target.value
        })
    }
    takeInputData(ourData)
    {
       // alert(this.state.value)
     
       
            this.setState( (
                {
                   
                    textButton:' Welcome '+this.state.value
                }
            ))
        ourData.preventDefault()
            }
    
    render() 
    {  
        return (
           
                <form className="form-group" onSubmit={this.takeInputData}>
                <h1>Login Form</h1>
                <div className="form-control">
                
                UserName : <  input type="text" value={this.state.value} onChange={this.handleChange}></input>
                <input type="submit" value="submit"></input>
                <h1>{this.state.textButton}</h1>
                </div>
               
            </form>
            
            
        );
    
    
    }
}

export default LoginForm;
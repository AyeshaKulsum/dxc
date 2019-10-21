import React, { Component } from 'react';

class UserLogin3 extends Component {
    constructor() {
        super();
        this.state=({
            validUser:true,
            textButton:'Login',
            LoginInCount:0,
            LoginOutCount:0

        })
        this.toggleButton=this.toggleButton.bind(this)
    }
toggleButton()
{
    if(this.state.validUser==true)
    {
       
            this.setState( prevState =>(
                {
                    validUser:false,
                    textButton:'Logout',
                    LoginInCount :prevState.LoginInCount+1
                }
            ))
        
        
    }
    else
    {
        this.setState(prevState =>({
            validUser:true,
            textButton:'Login',
            LoginOutCount :prevState.LoginOutCount+1
        }))
    }
}
    render() {
        return this.state.validUser ?
        <div>
                 Number of Logout : {this.state.LoginOutCount}
                
                <h1><button onClick={this.toggleButton}>{this.state.textButton}</button></h1></div>
        :
         <div>
            Number of Login : {this.state.LoginInCount}
            <h1><button onClick={this.toggleButton}>{this.state.textButton}</button></h1></div>  
   
}
    
}


export default UserLogin3;
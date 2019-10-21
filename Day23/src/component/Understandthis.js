import React, { Component } from 'react';
import PropTypes from 'prop-types';

export default class Understandthis extends Component {
    constructor(props) {
        super(props);
        console.log("LifeCycleDemoA cons")
        this.state={
            name:"Ayesha"
        }
        this.changeName=this.changeName.bind(this)
    }
changeName()
{
this.setState({
    name:"Kulsum"
})
}
changeName2=()=>
{
this.setState({
    name:"Saif"
})
}
    render() {
        console.log("LifeCycleDemoA render")
        

        return (
            <div>
                
                <h1>This is Understandthis</h1>
                <h1>Name:{this.state.name}</h1>
                <button onClick={this.changeName.bind(this)}>BindGO</button>
                <button onClick={()=>this.changeName()}>ArrowFunctionGO</button>
                <button onClick={this.changeName}>GoBindingInClassCons</button>
                <button onClick={this.changeName2}>ClassArrowBinding</button>
            </div>
        );
    }
}

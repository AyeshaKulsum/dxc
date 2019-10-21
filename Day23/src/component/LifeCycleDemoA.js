import React, { Component } from 'react';
import PropTypes from 'prop-types';
import LifeCycleDemoB from './LifeCycleDemoB';

class LifeCycleDemoA extends Component {
    constructor(props) {
        super(props);
        console.log("LifeCycleDemoA cons")
        this.state={
            name:"Ayesha"
        }
    }

    componentWillMount() {
        console.log("LifeCycleDemoA componentWillMount")
    }

    componentDidMount() {
        console.log("LifeCycleDemoA componentDidMount")
    }


    shouldComponentUpdate(nextProps, nextState) {
        console.log("LifeCycleDemoA shouldComponentUpdate")
        return true
    }

    componentWillUpdate(nextProps, nextState) {
        console.log("LifeCycleDemoA componentWillUpdate")
    }

    componentDidUpdate(prevProps, prevState) {
        console.log("LifeCycleDemoA componentDidUpdate")
    }

    componentWillUnmount() {
        console.log("LifeCycleDemoA componentWillUnmount")
    }
changeName()
{
this.setState({
    name:"Kulsum"
})
}
    render() {
        console.log("LifeCycleDemoA render")
        

        return (
            <div>
                <LifeCycleDemoB></LifeCycleDemoB>
                <h1>This is LifeCycleDemoA</h1>
                <h1>Name:{this.state.name}</h1>
                <button onClick={()=>this.changeName()}>Go</button>
            </div>
        );
    }
}



export default LifeCycleDemoA;
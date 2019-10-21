import React, { Component } from 'react';
import PropTypes from 'prop-types';

class LifeCycleDemoB extends Component {
    constructor(props) {
        super(props);
        console.log("LifeCycleDemoB cons")
    }

    componentWillMount() {
        console.log("LifeCycleDemoB componentWillMount")
    }

    componentDidMount() {
        console.log("LifeCycleDemoB componentDidMount")
    }


    shouldComponentUpdate(nextProps, nextState) {
        console.log("LifeCycleDemoB shouldComponentUpdate")
        return true
    }

    componentWillUpdate(nextProps, nextState) {
        console.log("LifeCycleDemoB componentWillUpdate")
    }

    componentDidUpdate(prevProps, prevState) {
        console.log("LifeCycleDemoB componentDidUpdate")
    }

    componentWillUnmount() {
        console.log("LifeCycleDemoB componentWillUnmount")
    }

    render() {
        console.log("LifeCycleDemoB render")
        return (
            <div>
                <h1>This is LifeCycleDemoB</h1>
                
            </div>
        );
    }
}



export default LifeCycleDemoB;
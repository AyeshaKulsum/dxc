import React, { Component } from 'react';
import ReactDOM from 'react-dom';
class Clock2 extends Component {
    constructor(props) {
        super(props);
        this.state={
            date:new Date()
        };
    }
    componentDidMount()
    {
        this.timerID =setInterval(
            () => this.changeCurrentDate(),1000
        );
    }
    changeCurrentDate()
    {
        this.setState({
            date:new Date()
        });
    }
    render() {
        return (
            <div>
                <h2> It is {this.state.date.toLocaleTimeString()}.</h2>
            </div>
        );
    }
}

export default Clock2;
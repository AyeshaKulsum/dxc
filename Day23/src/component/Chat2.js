import React, { Component } from 'react';

class Chat2 extends Component {
    display()
    {
        console.log("Display called");
    }
    render() {
        return (
            <div>
                <button onClick={this.display}>display</button>
            </div>
        );
    }
}

export default Chat2;
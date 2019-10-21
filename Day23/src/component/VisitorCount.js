import React, { Component } from 'react';

class VisitorCount extends Component {
    constructor(props) {
        super(props);
        this.state=(
            {
                numberOfUsers :0
            }

        )
    }
    incrementUser()
    {
        console.log("before clicking"+this.state.numberOfUsers)
        this.setState(prevState =>
            (
                {
                   // numberOfUsers : this.state.numberOfUsers+ 1
                   numberOfUsers :prevState.numberOfUsers+1
                }),
                () =>
                {
                 console.log("sync callback"+this.state.numberOfUsers)
                })
        
        
            console.log("async after clicking"+this.state.numberOfUsers)
            
        
    }
    
        incrementThreeTimes()
        {
            
                this.incrementUser()
                this.incrementUser()
                this.incrementUser()
            
            
        }
    
    
    render(props) {
        return  <div>
                Number of visitor : {this.state.numberOfUsers}<br/>
                <button onClick={() => this.incrementThreeTimes()}>Go</button>
            </div>
        
    }
}

export default VisitorCount;
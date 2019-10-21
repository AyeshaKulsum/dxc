import React, { Component } from 'react';

const Hello=({name,designation})=>
{
    return(
        <div>
            <h1>
                Hi {name} and designation is : {designation}
            </h1>
        </div>
    )
}


export default Hello;
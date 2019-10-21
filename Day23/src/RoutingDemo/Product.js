import React, { Component } from 'react';
import ProductList from '../component/ProductList';

class Product extends Component {
    render() {
        return (
            <div>
                <h1>Product List</h1>
                <ProductList></ProductList>
            </div>
        );
    }
}

export default Product;
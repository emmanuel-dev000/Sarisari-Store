import * as React from 'react';
import Stack from '@mui/material/Stack';
import Button from '@mui/material/Button';

export default function DefaultButton() {
    return (
        <Button 
          variant="contained" 
          onClick={() => { alert('clicked'); }}>
            Get All Products
        </Button>
    );
}
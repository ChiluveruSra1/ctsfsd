const express=require('express')
const router=express.Router()
const Employee=require('../models/employee')

router.get('/',async (req,res)=>{
    const employees= await Employee.find()

    try{
        res.status(200).json({
            error: false,
            data:employees
            
        })
    }
    catch (err){
        res.status(400).json({
            error:true,
            message: err.message
        })
    }
})

router.post('/',async (req,res)=>{
    let emp=req.body;
     console.log(emp)
    let doc= await Employee.create(emp)

    try{
        res.status(201).json({
            error:false,
            data:doc
        })
    }
    catch(err){
        res.status(400).json({
            error:true,
            message: err.message
        })
    } 
})

router.get('/:id',async (req,res)=>{
    const employees= await Employee.findById(req.params.id)
    if(!employees){
        res.status(404).json({
            message:"employee doesn't exist"
        })
    }
    try{
        res.status(200).json({
            error: false,
            data:employees
            
        })
    }
    catch (err){
        res.status(400).json({
            error:true,
            message: err.message
        })
    }
})

router.put('/:id',async (req,res)=>{
    const employees= await Employee.findByIdAndUpdate(req.params.id,req.body,{
        new: true,
        runValidators:true
    })
    if(!employees){
        res.status(404).json({
            message:"employee doesn't exist"
        })
    }
    try{
        res.status(200).json({
            error: false,
            data:employees
            
        })
    }
    catch (err){
        res.status(400).json({
            error:true,
            message: err.message
        })
    }
})

router.delete('/:id',async (req,res)=>{
    const employees= await Employee.findByIdAndDelete(req.params.id)
    if(!employees){
        res.status(404).json({
            message:"employee doesn't exist"
        })
    }
    try{
        res.status(200).json({
            error: false,
            data:employees
            
        })
    }
    catch (err){
        res.status(400).json({
            error:true,
            message: err.message
        })
    }
})




/* 

router.get('/',(req,res)=>{
    res.status(200).json({
        error:false,
        message: 'get all employees'
    })
})

/* router.post('/',(req,res)=>{
    console.log(req.body)
     res.status(201).json({
        error:false,
        message:'create new employee'
    }) 
}) 

router.put('/',(req,res)=>{
    res.status(200).json({
        error:false,
        message:'update employee'
    })
})

router.delete('/',(req,res)=>{
    res.status(200).json({
        error:false,
        message:'delete employee'
    })
})

 */

 module.exports=router;
<?php

namespace App\Http\Controllers;

use App\Models\User;
use App\Src\Repositories\UserRepository;
use App\Src\RepositoriesImp\UserEloquentRepository;
use Illuminate\Http\Request;

class UserController extends Controller
{
    //
    public function __construct(
        private UserRepository $userRepository
    )
    {
        
    }

    public function getById($id){
        $user = $this->userRepository->getById($id);
        return response()->json($user);
    }

    public function store(Request $request){
        $user = $this->userRepository->store($request->name, $request->email, $request->password);

        return response()->json($user);
    }
}
